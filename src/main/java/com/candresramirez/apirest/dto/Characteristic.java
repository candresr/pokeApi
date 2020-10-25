package com.candresramirez.apirest.dto;

public class Characteristic {

		private Integer id;
		private Integer gene_modulo;
		private Object possible_values[];
		private Object highest_stat;
		private Object descriptions[];
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Integer getGene_modulo() {
			return gene_modulo;
		}
		public void setGene_modulo(Integer gene_modulo) {
			this.gene_modulo = gene_modulo;
		}
		public Object[] getPossible_values() {
			return possible_values;
		}
		public void setPossible_values(Object[] possible_values) {
			this.possible_values = possible_values;
		}
		public Object getHighest_stat() {
			return highest_stat;
		}
		public void setHighest_stat(Object highest_stat) {
			this.highest_stat = highest_stat;
		}
		public Object[] getDescriptions() {
			return descriptions;
		}
		public void setDescriptions(Object[] descriptions) {
			this.descriptions = descriptions;
		}
		
		
}
